package com.company;

import java.util.*;

/**
 * Created by Melvision on 19/05/2016.
 */
public class MusicPlaylist {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Mr Cips", "Calabar Runs");
        album.addSong("Jons Man", 3.21);
        album.addSong("Storyboard", 3.40);
        album.addSong("Last Time", 4.21);
        album.addSong("Business Man", 5.21);
        album.addSong("Babalawo", 3.33);
        album.addSong("Lest I forget", 3.44);
        album.addSong("Death is not Important", 5.42);
        album.addSong("Heavenly Father", 3.01);
        album.addSong("Crossroads", 3.70);
        album.addSong("Chicken Run", 5.31);
        album.addSong("See you soon", 3.80);
        albums.add(album);

        album = new Album("Wiz Kid", "Star Boi");
        album.addSong("Mr Exclusive", 3.21);
        album.addSong("Checkout Time", 3.40);
        album.addSong("Cotonou to Benin", 4.21);
        album.addSong("Lordd have mercy", 5.21);
        album.addSong("I Told you so..", 3.33);
        album.addSong("Lekki Vibes", 3.44);
        album.addSong("DTP", 5.42);
        album.addSong("Staying Ahead", 3.01);
        album.addSong("No Crossroads", 3.70);
        album.addSong("Caro", 5.31);
        album.addSong("Jeje for for me ooh", 3.80);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Babalawo", playList);
        albums.get(0).addToPlayList("See you soon", playList);
        albums.get(0).addToPlayList("Chucks", playList); // Doesn't exisits
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); // There is no track 24

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Avaliable actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print avaliable actions.\n" +
                "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song>playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===============================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===============================");
    }
}


















