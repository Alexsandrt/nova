package com.example.red3.service;

import com.example.red3.entity.Text;
import com.example.red3.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextService {

    @Autowired
    private TextRepository textRepository;

    public void addText(String text) {
        Text textEntity = new Text();
        textEntity.setText(text);
        textRepository.save(textEntity);
    }
}