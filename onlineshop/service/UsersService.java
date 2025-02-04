package de.telran.onlineshop.service;

import de.telran.onlineshop.dto.UserDto;
import de.telran.onlineshop.entity.Role;
import de.telran.onlineshop.entity.UsersEntity;
import de.telran.onlineshop.repository.UsersRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;
    private List<UserDto> userDtoList;

    @PostConstruct
    void initUsers() {

        UsersEntity user1 = new UsersEntity(null, "Peter", "peter@gmail/com", "+4915121748923", "peter45", Role.ADMINISTRATOR);
        usersRepository.save(user1);

        UsersEntity user2 = new UsersEntity(null, "Olga", "olga@gmail/com", "+4915121748977", "olga24", Role.CLIENT);
        usersRepository.save(user2);

        UsersEntity user3 = new UsersEntity(null, "Anna", "Anna@gmail/com", "+4915121748753", "Anna41", Role.CLIENT);
        usersRepository.save(user3);

        UsersEntity user4 = new UsersEntity(null, "Max", "max@gmail/com", "+4915735748923", "max27", Role.CLIENT);
        usersRepository.save(user4);

        UsersEntity user5 = new UsersEntity(null, "Irina", "irina@gmail/com", "+4912115856727", "irina31", Role.CLIENT);
        usersRepository.save(user5);

        System.out.println("Выполняем логику при создании объекта " + this.getClass().getName());
    }

    public List<UserDto> getAllUsers() {
        List<UsersEntity> usersEntity = usersRepository.findAll();
        return usersEntity.stream()
                .map(entity -> new UserDto(entity.getUserId(), entity.getName(), entity.getEmail(), entity.getPhoneNumber(), entity.getPasswordHash(), UserDto.Role.CLIENT))
                .collect(Collectors.toList());
    }

    public UserDto getUserByID(Long id) {
        UsersEntity usersEntity1 = usersRepository.findByIdMeine(id);
        return new UserDto(usersEntity1.getUserId(), usersEntity1.getName(), usersEntity1.getEmail(), usersEntity1.getPhoneNumber(), usersEntity1.getPasswordHash(), UserDto.Role.CLIENT);
    }

    public UserDto getUserByName(String name) {
        UsersEntity usersEntity = usersRepository.findByName(name);
        return new UserDto(usersEntity.getUserId(), usersEntity.getName(), usersEntity.getEmail(), usersEntity.getPhoneNumber(), usersEntity.getPasswordHash(), UserDto.Role.CLIENT);
    }

    public boolean createUsers(UserDto newUserDto) { //insert
        UsersEntity createUsersEntity = new UsersEntity(null, newUserDto.getName(), newUserDto.getEmail(), newUserDto.getPhoneNumber(), newUserDto.getPasswordHash(), null);
        UsersEntity returnUserEntity = usersRepository.save(createUsersEntity);
        return returnUserEntity.getUserId() != null;
    }

    public UserDto updateUsers(UserDto updUserDto) { //update
        UsersEntity updUserEntity = new UsersEntity(updUserDto.getUserID(), updUserDto.getName(), updUserDto.getEmail(), updUserDto.getPhoneNumber(), updUserDto.getPasswordHash(), null);
        UsersEntity returnUserEntity = usersRepository.save(updUserEntity);
        return new UserDto(returnUserEntity.getUserId(), returnUserEntity.getName(), returnUserEntity.getEmail(), returnUserEntity.getPhoneNumber(), returnUserEntity.getPasswordHash(), null);
    }
    public void deleteUsers(Long id) { //delete
        UsersEntity users = usersRepository.findById(id).orElse(null);
        if (users == null) {
            throw new RuntimeException("Нету такого объекта с Id = " + id);
        } else {
            usersRepository.delete(users);
        }
    }
    public void destroyUser() {
        userDtoList.clear();
        System.out.println("Выполняем логику при окончании работы с  объектом " + this.getClass().getName());
    }

}
