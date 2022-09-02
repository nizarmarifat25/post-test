package com.posttest.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.posttest.models.entity.User;
import com.posttest.models.repos.List;
import com.posttest.models.repos.UserRepo;

@Service
@Transactional
public class UserService {
    
    @Autowired
   private UserRepo userRepo;

   public User save(User user){
    return userRepo.save(user);
   }

   public User findOne(Long id){
    return userRepo.findById(id).get();
   }

   public Iterable<User> findAll(){
    return userRepo.findAll();
   }

   public void removeOne(Long id) {
    userRepo.deleteById(id);
   }

   public List <User> findByName(String name) {
    return userRepo.findByNameContains(name);
   }
}
