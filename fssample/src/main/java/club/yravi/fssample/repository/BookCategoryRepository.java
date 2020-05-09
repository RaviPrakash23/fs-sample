package club.yravi.fssample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import club.yravi.fssample.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCateogry", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
