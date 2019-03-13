package services.map;

import model.Client;
import org.springframework.stereotype.Service;
import services.ClientService;

import java.util.Set;
@Service
public class ClientServiceMap extends AbstractMapService<Client,Long> implements ClientService {
    @Override
    public Set<Client> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Client object) {
        super.delete(object);
    }

    @Override
    public Client save(Client object) {
        return super.save(object);
    }

    @Override
    public Client findById(Long id) {
        return super.findById(id);
    }
}
