package JavaDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import JavaDemo.dataAccess.abstracts.ProgrammingLanguageRepository;
import JavaDemo.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	private List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage("C#", 1));
		programmingLanguages.add(new ProgrammingLanguage("Java", 2));
		programmingLanguages.add(new ProgrammingLanguage("Phyton", 3));
        programmingLanguages.add(new ProgrammingLanguage("C#",1));

	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.set(programmingLanguages.indexOf(programmingLanguage), programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.remove(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return programmingLanguages.get(id);
	}

}
