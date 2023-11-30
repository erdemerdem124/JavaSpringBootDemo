package JavaDemo.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaDemo.business.abstracts.ProgrammingLanguageService;
import JavaDemo.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/program")
public class Controller {
 private ProgrammingLanguageService programmingLanguageService;

 @Autowired
public Controller(ProgrammingLanguageService programmingLanguageService) {
this.programmingLanguageService=programmingLanguageService;
}

 @GetMapping("/getall")
public List<ProgrammingLanguage> getAll(){
	return programmingLanguageService.getAll();
	
}
 @GetMapping("/add")
public void add(ProgrammingLanguage programmingLanguage) throws Exception {
	programmingLanguageService.add(programmingLanguage);
}
 @GetMapping("/delete")
public void delete(ProgrammingLanguage programmingLanguage) {
programmingLanguageService.delete(programmingLanguage);	
}
 @GetMapping("/update")
public void update(ProgrammingLanguage programmingLanguage) {
	programmingLanguageService.update(programmingLanguage);
}
 @GetMapping("/getbyid")
public void getById(int id) {
	programmingLanguageService.getById(id);
}
}
