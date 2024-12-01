package de.telran.onlineshop.service;

import de.telran.onlineshop.entity.FavoritesEntity;
import de.telran.onlineshop.dto.FavoriteDto;
import de.telran.onlineshop.repository.FavoritesRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FavoritesService {

    private final FavoritesRepository favoritesRepository;
//    List<FavoriteDto> favoriteDtoList;
//
//    @PostConstruct
//    public void initFavorites() {
//        FavoritesEntity favorite1 = new FavoritesEntity(1L, 1L, 5L);
//        favoritesRepository.save(favorite1);
//
//        FavoritesEntity favorite2 = new FavoritesEntity(2L, 2L, 10L);
//        favoritesRepository.save(favorite2);
//
//        FavoritesEntity favorite3 = new FavoritesEntity(3L, 4L, 4L);
//        favoritesRepository.save(favorite3);
//
//        System.out.println("Выполняем логику при создании объекта " + this.getClass().getName());
//    }
//
//    public List<FavoriteDto> getAllFavorites() {
//        List<FavoritesEntity> favoritesEntities = favoritesRepository.findAll();
//        return favoritesEntities.stream()
//                .map(entity -> new FavoriteDto(entity.getFavoriteId(), entity.getUserId(), entity.getProductId()))
//                .collect(Collectors.toList());
//    }
//
//    public FavoriteDto getFavoriteById(Long id) { ///categories/find/3
//        FavoritesEntity favoritesEntity = favoritesRepository.findById(id).orElse(new FavoritesEntity());
//        return new FavoriteDto(favoritesEntity.getFavoriteId(), favoritesEntity.getUserId(), favoritesEntity.getProductId());
//    }
//
//    public boolean addFavorite(FavoriteDto favoriteDto) {
//        FavoritesEntity favoritesEntity=new FavoritesEntity(null, favoriteDto.getUserID(), favoriteDto.getProductID());
//        FavoritesEntity returnFavoriteEntity = favoritesRepository.save(favoritesEntity);
//        return returnFavoriteEntity.getFavoriteId() !=0;
//    }
//
//    public FavoriteDto updateFavorite(FavoriteDto updFavoriteDto){
//        FavoritesEntity createFavoriteEntity = new FavoritesEntity(updFavoriteDto.getFavoriteID(), updFavoriteDto.getUserID(), updFavoriteDto.getProductID());
//        FavoritesEntity returnFavoriteEntity = favoritesRepository.save(createFavoriteEntity);
//        return new FavoriteDto(returnFavoriteEntity.getFavoriteId(), returnFavoriteEntity.getUserId(), returnFavoriteEntity.getProductId());
//    }
//
//    public void deleteFavorite( Long id){
//        FavoritesEntity favorites = favoritesRepository.findById(id).orElse(null);
//        if(favorites==null){
//            throw new RuntimeException("Нету такого объекта с Id = "+id);
//        }else {
//            favoritesRepository.delete(favorites);
//        }
//    }
//
//    @PreDestroy
//    void destroyFavoritesList() {
//        favoriteDtoList.clear();
//        System.out.println("Выполняем логику при окончании работы с  объектом " + this.getClass().getName());
//    }

}
