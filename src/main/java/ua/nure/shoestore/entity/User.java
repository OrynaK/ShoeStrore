package ua.nure.shoestore.entity;

import ua.nure.shoestore.entity.enums.Role;

import java.util.List;
import java.util.Objects;

public class User {
    private long user_id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Role role;
    private List<Long> address;
    private boolean blocked;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Long> getAddress() {
        return address;
    }

    public void setAddress(List<Long> address) {
        this.address = address;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user_id == user.user_id && blocked == user.blocked && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && role == user.role && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, name, surname, email, password, role, address, blocked);
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", address=" + address +
                ", blocked=" + blocked +
                '}';
    }
}
