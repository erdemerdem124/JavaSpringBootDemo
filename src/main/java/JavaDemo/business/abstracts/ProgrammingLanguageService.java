package JavaDemo.business.abstracts;

import java.util.List;

import JavaDemo.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
List<ProgrammingLanguage> getAll();
void add(ProgrammingLanguage programmingLanguage)throws Exception;
void delete(ProgrammingLanguage programmingLanguage);
void update(ProgrammingLanguage programmingLanguage);
void getById(int id);
}
