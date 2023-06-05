package lam.service.role;

import lam.model.Role;
import lam.model.RoleName;
import lam.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceIMPL implements IRoleService{
    @Autowired
    IRoleRepository repository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return repository.findByName(name);
    }
}