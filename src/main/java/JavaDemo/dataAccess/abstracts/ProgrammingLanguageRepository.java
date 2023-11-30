package JavaDemo.dataAccess.abstracts;

import java.util.List;

import JavaDemo.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
List<ProgrammingLanguage> getAll();
void add(ProgrammingLanguage programmingLanguage);
void update(ProgrammingLanguage programmingLanguage);
void delete(ProgrammingLanguage programmingLanguage);
ProgrammingLanguage getById(int id);
}
