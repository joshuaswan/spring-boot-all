/**
 * Created by joshua on 2017/10/26.
 */
interface ReadingListRepository {
    List<Book> findByReader(String reader)

    void save(Book book)
}