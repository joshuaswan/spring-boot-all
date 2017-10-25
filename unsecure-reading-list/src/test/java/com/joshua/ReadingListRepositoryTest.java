package com.joshua;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/10/25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UnsecureReadingListApplication.class)
public class ReadingListRepositoryTest {

    @Autowired
    private ReadingListRepository readingListRepository;

    @Test
    @Transactional
    public void saveAsBook() throws Exception{
        assertEquals(0,readingListRepository.findAll().size());

        Book book = new Book();
        book.setTitle("TITLE");
        book.setDescription("DESCRIPTION");
        book.setAuthor("AUTHOR");
        book.setIsbn("1234567890");
        book.setReader("reader");
        Book saved = readingListRepository.save(book);

        Book found = readingListRepository.findOne(saved.getId());
        assertEquals(saved.getId(), found.getId());
        assertEquals("TITLE", found.getTitle());
        assertEquals("DESCRIPTION", found.getDescription());
        assertEquals("AUTHOR", found.getAuthor());
        assertEquals("1234567890", found.getIsbn());
        assertEquals("reader", found.getReader());
    }

}