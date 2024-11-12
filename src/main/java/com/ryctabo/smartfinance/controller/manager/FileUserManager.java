package com.ryctabo.smartfinance.controller.manager;

import com.ryctabo.smartfinance.controller.formatter.UserFormatter;
import com.ryctabo.smartfinance.controller.parser.UserParser;
import com.ryctabo.smartfinance.model.user.Role;
import com.ryctabo.smartfinance.model.user.User;
import com.ryctabo.smartfinance.model.user.UserManager;

import java.io.*;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileUserManager implements UserManager {
    private static final String FILE_NAME = "users.txt";
    private static final String FILE_PATH = System.getProperty("user.dir") + FileSystems.getDefault().getSeparator() + FILE_NAME;

    private final List<User> users;

    private FileUserManager() {
        this.users = new ArrayList<>();
        this.load();
    }

    private static FileUserManager instance;

    public static FileUserManager getInstance() {
        if (instance == null) {
            instance = new FileUserManager();
        }
        return instance;
    }

    @Override
    public void create(String username, String password, Role role) {
        var user = this.findByUsername(username);
        if (user != null) {
            return;
        }
        this.users.add(new User(username, password, role));
        this.save();
    }

    @Override
    public User update(String username, String password, Role role) {
        var user = this.findByUsername(username);
        if (user == null) {
            return null;
        }
        user.setPassword(password);
        user.setRole(role);
        this.save();
        return user;
    }

    @Override
    public User delete(String username) {
        var user = this.findByUsername(username);
        if (user == null) {
            return null;
        }
        this.users.remove(user);
        this.save();
        return user;
    }

    @Override
    public User findByUsername(String username) {
        for (User user : this.users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return Collections.unmodifiableList(this.users);
    }

    private void save() {
        var file = new File(FILE_PATH);
        try (var bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (User user : this.users) {
                var formatter = new UserFormatter();
                bufferedWriter.write(formatter.format(user));
                bufferedWriter.newLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void load() {
        try {
            var file = new File(FILE_PATH);
            if (!file.exists()) {
                return;
            }
            try (var bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    var parser = new UserParser();
                    this.users.add(parser.parse(line));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
