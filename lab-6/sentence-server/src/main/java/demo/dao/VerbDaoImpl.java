package demo.dao;

import org.springframework.stereotype.Component;

@Component
public class VerbDaoImpl extends WordDaoImpl {

	@Override
	public String getPartOfSpeech() {
		return VERB;
	}

	
}
