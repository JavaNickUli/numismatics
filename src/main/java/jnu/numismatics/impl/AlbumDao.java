package jnu.numismatics.impl;

import jnu.numismatics.entity.Album;

import java.util.List;

public interface AlbumDao {

    int createAlbum(Album album);

    String readAlbum(int id);

    int readAlbum(Album album);

    List<String> readAllAlbum();

    void updateAlbum(int id, Album album);

    void deleteAlbum(Album album);
}
