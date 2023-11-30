package JavaDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaDemo.business.abstracts.ProgrammingLanguageService;
import JavaDemo.dataAccess.abstracts.ProgrammingLanguageRepository;
import JavaDemo.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	List<ProgrammingLanguage> programmingLanguages;
	 ProgrammingLanguageRepository programmingLanguageRepository;

	    @Autowired
	public ProgrammingLanguageManager(List<ProgrammingLanguage> programmingLanguage,
			ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguages = programmingLanguage;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
	for(ProgrammingLanguage a : programmingLanguages) {
		if(!(a.getName().isEmpty())) {
			if(a.getName().equals(programmingLanguage.getName())) {
				throw new Exception("Bu isim kullanılmıştır : "+programmingLanguage.getName());
			}
			programmingLanguageRepository.add(programmingLanguage);
		}
		throw new Exception("bu alan doldurulmalı");
	}
}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.delete(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public void getById(int id) {
	programmingLanguageRepository.getById(id);
	}

}
