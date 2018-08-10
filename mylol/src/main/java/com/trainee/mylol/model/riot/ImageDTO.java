package com.trainee.mylol.model.riot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageDTO {

    private String full;
    private String group;
    private String sprite;
    private int h;
    private int w;
    private int x;
    private int y;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.full);
        hash = 37 * hash + Objects.hashCode(this.group);
        hash = 37 * hash + Objects.hashCode(this.sprite);
        hash = 37 * hash + this.h;
        hash = 37 * hash + this.w;
        hash = 37 * hash + this.x;
        hash = 37 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ImageDTO other = (ImageDTO) obj;
        if (this.h != other.h) {
            return false;
        }
        if (this.w != other.w) {
            return false;
        }
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (!Objects.equals(this.full, other.full)) {
            return false;
        }
        if (!Objects.equals(this.group, other.group)) {
            return false;
        }
        return Objects.equals(this.sprite, other.sprite);
    }

    @Override
    public String toString() {
        return "ImageDTO{" + "full=" + full + ", group=" + group + ", sprite=" + sprite + ", h=" + h + ", w=" + w + ", x=" + x + ", y=" + y + '}';
    }
}
