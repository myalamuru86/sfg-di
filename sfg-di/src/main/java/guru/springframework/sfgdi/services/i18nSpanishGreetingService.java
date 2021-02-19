package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class i18nSpanishGreetingService implements GreetingService{

	public String sayGreeting() {
		return "Hola Mundo - Spanish Service!";
	}
	
}
