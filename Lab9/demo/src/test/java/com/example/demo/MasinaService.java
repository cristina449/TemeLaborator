package com.exemplu.masini.service;
import com.exemplu.masini.model.Masina;
import com.exemplu.masini.repository.MasinaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MasinaService {
    private final MasinaRepository masinaRepository;
    public MasinaService(MasinaRepository masinaRepository) {
        this.masinaRepository = masinaRepository;
    }
    public void adaugaMasina(Masina masina) {
        masinaRepository.save(masina);
    }
    public void stergeMasina(String numarInmatriculare) {
        masinaRepository.deleteById(numarInmatriculare);
    }
    public Optional<Masina> cautaMasina(String numarInmatriculare) {
        return masinaRepository.findById(numarInmatriculare);
    }
    public Iterable<Masina> toateMasinile() {
        return masinaRepository.findAll();
    }
    public int numaraMasiniCuMarca(String marca) {
        return masinaRepository.countByMarca(marca);
    }
    public List<Masina> masiniSub100Kkm() {
        return masinaRepository.findAllByKilometrajUnder();
    }
    public List<Masina> masiniNoi() {
        return masinaRepository.findAllNewerThanFiveYears();
    }
}
