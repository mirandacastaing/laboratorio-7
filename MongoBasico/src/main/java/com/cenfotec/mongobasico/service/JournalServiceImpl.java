package com.cenfotec.mongobasico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cenfotec.mongobasico.domain.Journal;
import com.cenfotec.mongobasico.repository.JournalRepository;

@Service
public class JournalServiceImpl implements JournalService {
	@Autowired
	JournalRepository journalRepo;

	@Override
	public List<Journal> getAllJournals() {
		return journalRepo.findAll();
	}

	@Override
	public void saveJournal(Journal newJournal) {
		journalRepo.save(newJournal);
	}

	@Override
	public List<Journal> findJournalsByTitle(String title) {
		return journalRepo.findByTitleLike(title);
	}

	@Override
	public void deleteAllJournals() {
		journalRepo.deleteAll();
	}
}
