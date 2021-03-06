package com.example.ooad.service;

import com.example.ooad.domain.TranscriptEntry;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface TranscriptEntryService {
    List<TranscriptEntry> findByStudentId(Integer id);
    List<TranscriptEntry> findBySectionId(Integer id);
    TranscriptEntry findById(Integer id);
    void deleteById(Integer id);
    void update(TranscriptEntry transcriptEntry);
    void insert(TranscriptEntry transcriptEntry);

}
