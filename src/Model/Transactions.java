public class Transactions {
    int id;
    User user_id;
    Books books_id;
    public Transactions(int id, User user_id, Books books_id) {
        this.id = id;
        this.user_id = user_id;
        this.books_id = books_id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public User getUser_id() {
        return user_id;
    }
    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }
    public Books getBooks_id() {
        return books_id;
    }
    public void setBooks_id(Books books_id) {
        this.books_id = books_id;
    }
    
}