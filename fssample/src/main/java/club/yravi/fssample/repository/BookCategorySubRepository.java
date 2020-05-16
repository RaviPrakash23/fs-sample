package club.yravi.fssample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import club.yravi.fssample.entity.BookCategorySub;

@RepositoryRestResource(collectionResourceRel = "bookCateogrySub", path="book-category-sub")
public interface BookCategorySubRepository extends JpaRepository<BookCategorySub, Long> {

}
