package lam.service.role;

import lam.model.Role;
import lam.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
