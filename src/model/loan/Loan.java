package model.loan;

import model.library.Book;
import model.student.Student;

import java.sql.SQLException;

public class Loan {
    private String  bookCode;

    private int studentCode;

    public Loan(String bookCode, int studentCode) throws SQLException {
        this.bookCode = bookCode;
        this.studentCode = studentCode;
    }

    public boolean isValidLoan() throws SQLException {
       return Book.isValidCode(this.bookCode) && Student.isValidStudentCode(this.studentCode);
    }


}
