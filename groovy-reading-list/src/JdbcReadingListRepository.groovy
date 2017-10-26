
/**
 * Created by joshua on 2017/10/26.
 */
@Repository
class JdbcReadingListRepository implements ReadingListRepository {

    @Autowired
    JdbcTemplate jdbcTemplate

    @Override
    List<Book> findByReader(String reader) {
        jdbcTemplate.query(
                "select id,reader,isbn,title,author,description " +
                        "from Book where reader=?",
                {
                    rs, row ->
                        new Book(id: rs.getLong(1),
                                reader: rs.getString(2),
                                isbn: rs.getString(3),
                                title: rs.getString(4),
                                author: rs.getString(5)
                                description: rs.getString(6))
                } as RowMapper,
                reader
        )
    }

    @Override
    void save(Book book) {
        jdbcTemplate.update("insert INTO Book " +
                "(reader,isbn,title,author,description) " +
                "VALUES (?,?,?,?,?)",
        book.reader,
        book.isbn,
        book.title,
        book.author,
        book.description)
    }
}
