package com.exemplu.masini.repository;
import com.exemplu.masini.model.Masina;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MasinaRepository extends CrudRepository<Masina, String> {

    @Query("SELECT COUNT(*) FROM masini WHERE marca = :marca")
    int countByMarca(String marca);

    @Query("SELECT * FROM masini WHERE kilometraj < 100000")
    List<Masina> findAllByKilometrajUnder();

    @Query("SELECT * FROM masini WHERE an_fabricatie > YEAR(CURDATE()) - 5")
    List<Masina> findAllNewerThanFiveYears();
}
