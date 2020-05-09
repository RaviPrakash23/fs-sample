package club.yravi.fssample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import club.yravi.fssample.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
