import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Book } from '../common/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUer = 'http://localhost:8092/api/v1/books'

  constructor(private httpClient: HttpClient) { }

  getBooks(): Observable<Book[]> {
    return this.httpClient.get<GetResponseBooks>(this.baseUer).pipe(
      map( response => response._embedded.books )
    )
  }

}

interface GetResponseBooks{
  _embedded: {
    books: Book[];
  }
}