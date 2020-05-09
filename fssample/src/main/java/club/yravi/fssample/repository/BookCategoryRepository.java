package club.yravi.fssample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import club.yravi.fssample.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
