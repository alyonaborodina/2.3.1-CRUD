package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

public class CarServiceImp implements CarService {

    private CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> getCarByCount(int count) {
        return carDao.getCarByCount(count);
    }
}
