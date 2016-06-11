package cz.tul.repositories;

import cz.tul.data.Picture;

import java.util.Date;

/**
 * Created by zdars on 6/9/2016.
 */
public interface CustomPictureRepository {
    Picture first();

    Picture previous(Date date);

    Picture next(Date date);
}