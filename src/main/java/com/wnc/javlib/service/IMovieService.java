package com.wnc.javlib.service;

import com.wnc.javlib.jpa.entity.JMovie;
import org.jsoup.nodes.Document;

public interface IMovieService {
    JMovie getMovieDetail(Document doc);
}
