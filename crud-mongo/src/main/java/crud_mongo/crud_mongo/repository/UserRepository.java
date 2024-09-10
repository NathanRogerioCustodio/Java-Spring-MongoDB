package crud_mongo.crud_mongo.repository;

import crud_mongo.crud_mongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
}