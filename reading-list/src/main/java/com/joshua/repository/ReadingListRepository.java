package com.joshua.repository;

import com.joshua.entity.Book;
import com.joshua.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by joshua on 2017/10/18.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long>{
    List<Book> findByReader(Reader reader);
}
