package com.joshua;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by joshua on 2017/10/26.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {

    List<Book> findByReader(Reader reader);
}
