package sk.umb.skuska.service;

import org.springframework.stereotype.Service;
import sk.umb.skuska.model.CdRepository;
import sk.umb.skuska.model.entity.Cd;

import java.util.List;

@Service
public class CdService {

    private final CdRepository cdRepository;

    public CdService(CdRepository cdRepository) {
        this.cdRepository = cdRepository;
    }

    public Cd addCd(Cd cd) {
        return cdRepository.save(cd);
    }

    public List<Cd> getAllCds() {
        return cdRepository.findAll();
    }


}
