package tk.sandelisvgtu.vgtuwarehouseapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tk.sandelisvgtu.vgtuwarehouseapi.model.User;
import tk.sandelisvgtu.vgtuwarehouseapi.model.WarehouseUserDetails;
import tk.sandelisvgtu.vgtuwarehouseapi.repo.UserRepository;

import java.util.Optional;

@Service
public class WarehouseUserDetailsService extends User implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUsers = userRepository.findByUsername(username);

        optionalUsers
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        return optionalUsers
                .map(WarehouseUserDetails::new).get();
    }


}
