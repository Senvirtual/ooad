package com.example.ooad.service.serviceimpl;

import com.example.ooad.dao.TranscriptEntryMapper;
import com.example.ooad.domain.TranscriptEntry;
import com.example.ooad.service.TranscriptEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranscriptEntryServiceImpl implements TranscriptEntryService {

    @Autowired
    TranscriptEntryMapper transcriptEntryMapper;
    @Override
    public List<TranscriptEntry> findByStudentId(Integer id) {
        return transcriptEntryMapper.findByStudentId(id);
    }

    @Override
    public List<TranscriptEntry> findBySectionId(Integer id) {
        return transcriptEntryMapper.findBySectionId(id);
    }

    @Override
    public TranscriptEntry findById(Integer id) {
        return transcriptEntryMapper.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        transcriptEntryMapper.deleteById(id);
    }

    @Override
    public void update(TranscriptEntry transcriptEntry) {
        transcriptEntryMapper.update(transcriptEntry);
    }

    @Override
    public void insert(TranscriptEntry transcriptEntry) {
        transcriptEntryMapper.insert(transcriptEntry);
    }

}
