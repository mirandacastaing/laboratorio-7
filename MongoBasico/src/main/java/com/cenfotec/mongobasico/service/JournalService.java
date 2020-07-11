package com.cenfotec.mongobasico.service;

import java.util.List;

import com.cenfotec.mongobasico.domain.Journal;

public interface JournalService {
	public List<Journal> getAllJournals();

	public void saveJournal(Journal newJournal);

	public List<Journal> findJournalsByTitle(String title);

	public void deleteAllJournals();
}
