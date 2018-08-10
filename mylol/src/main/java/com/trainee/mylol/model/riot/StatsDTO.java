package com.trainee.mylol.model.riot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatsDTO {

    private int armorperlevel;
    private float attackdamage;
    private int mpperlevel;
    private float attackspeedoffset;
    private int mp;
    private float armor;
    private int hp;
    private float hpregenperlevel;
    private float attackspeedperlevel;
    private int attackrange;
    private int movespeed;
    private float attackdamageperlevel;
    private float mpregenperlevel;
    private int critperlevel;
    private float spellblockperlevel;
    private int crit;
    private int mpregen;
    private int spellblock;
    private float hpregen;
    private int hpperlevel;

    public int getArmorperlevel() {
        return armorperlevel;
    }

    public void setArmorperlevel(int armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    public float getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(float attackdamage) {
        this.attackdamage = attackdamage;
    }

    public int getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(int mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    public float getAttackspeedoffset() {
        return attackspeedoffset;
    }

    public void setAttackspeedoffset(float attackspeedoffset) {
        this.attackspeedoffset = attackspeedoffset;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public float getHpregenperlevel() {
        return hpregenperlevel;
    }

    public void setHpregenperlevel(float hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    public float getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(float attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    public int getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(int attackrange) {
        this.attackrange = attackrange;
    }

    public int getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(int movespeed) {
        this.movespeed = movespeed;
    }

    public float getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    public void setAttackdamageperlevel(float attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    public float getMpregenperlevel() {
        return mpregenperlevel;
    }

    public void setMpregenperlevel(float mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    public int getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(int critperlevel) {
        this.critperlevel = critperlevel;
    }

    public float getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(float spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getMpregen() {
        return mpregen;
    }

    public void setMpregen(int mpregen) {
        this.mpregen = mpregen;
    }

    public int getSpellblock() {
        return spellblock;
    }

    public void setSpellblock(int spellblock) {
        this.spellblock = spellblock;
    }

    public float getHpregen() {
        return hpregen;
    }

    public void setHpregen(float hpregen) {
        this.hpregen = hpregen;
    }

    public int getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(int hpperlevel) {
        this.hpperlevel = hpperlevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.armorperlevel;
        hash = 37 * hash + Float.floatToIntBits(this.attackdamage);
        hash = 37 * hash + this.mpperlevel;
        hash = 37 * hash + Float.floatToIntBits(this.attackspeedoffset);
        hash = 37 * hash + this.mp;
        hash = 37 * hash + Float.floatToIntBits(this.armor);
        hash = 37 * hash + this.hp;
        hash = 37 * hash + Float.floatToIntBits(this.hpregenperlevel);
        hash = 37 * hash + Float.floatToIntBits(this.attackspeedperlevel);
        hash = 37 * hash + this.attackrange;
        hash = 37 * hash + this.movespeed;
        hash = 37 * hash + Float.floatToIntBits(this.attackdamageperlevel);
        hash = 37 * hash + Float.floatToIntBits(this.mpregenperlevel);
        hash = 37 * hash + this.critperlevel;
        hash = 37 * hash + Float.floatToIntBits(this.spellblockperlevel);
        hash = 37 * hash + this.crit;
        hash = 37 * hash + this.mpregen;
        hash = 37 * hash + this.spellblock;
        hash = 37 * hash + Float.floatToIntBits(this.hpregen);
        hash = 37 * hash + this.hpperlevel;
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
        final StatsDTO other = (StatsDTO) obj;
        if (this.armorperlevel != other.armorperlevel) {
            return false;
        }
        if (Float.floatToIntBits(this.attackdamage) != Float.floatToIntBits(other.attackdamage)) {
            return false;
        }
        if (this.mpperlevel != other.mpperlevel) {
            return false;
        }
        if (Float.floatToIntBits(this.attackspeedoffset) != Float.floatToIntBits(other.attackspeedoffset)) {
            return false;
        }
        if (this.mp != other.mp) {
            return false;
        }
        if (Float.floatToIntBits(this.armor) != Float.floatToIntBits(other.armor)) {
            return false;
        }
        if (this.hp != other.hp) {
            return false;
        }
        if (Float.floatToIntBits(this.hpregenperlevel) != Float.floatToIntBits(other.hpregenperlevel)) {
            return false;
        }
        if (Float.floatToIntBits(this.attackspeedperlevel) != Float.floatToIntBits(other.attackspeedperlevel)) {
            return false;
        }
        if (this.attackrange != other.attackrange) {
            return false;
        }
        if (this.movespeed != other.movespeed) {
            return false;
        }
        if (Float.floatToIntBits(this.attackdamageperlevel) != Float.floatToIntBits(other.attackdamageperlevel)) {
            return false;
        }
        if (Float.floatToIntBits(this.mpregenperlevel) != Float.floatToIntBits(other.mpregenperlevel)) {
            return false;
        }
        if (this.critperlevel != other.critperlevel) {
            return false;
        }
        if (Float.floatToIntBits(this.spellblockperlevel) != Float.floatToIntBits(other.spellblockperlevel)) {
            return false;
        }
        if (this.crit != other.crit) {
            return false;
        }
        if (this.mpregen != other.mpregen) {
            return false;
        }
        if (this.spellblock != other.spellblock) {
            return false;
        }
        if (Float.floatToIntBits(this.hpregen) != Float.floatToIntBits(other.hpregen)) {
            return false;
        }
        return this.hpperlevel == other.hpperlevel;
    }

    @Override
    public String toString() {
        return "StatsDto{" + "armorperlevel=" + armorperlevel + ", attackdamage=" + attackdamage + ", mpperlevel=" + mpperlevel + ", attackspeedoffset=" + attackspeedoffset + ", mp=" + mp + ", armor=" + armor + ", hp=" + hp + ", hpregenperlevel=" + hpregenperlevel + ", attackspeedperlevel=" + attackspeedperlevel + ", attackrange=" + attackrange + ", movespeed=" + movespeed + ", attackdamageperlevel=" + attackdamageperlevel + ", mpregenperlevel=" + mpregenperlevel + ", critperlevel=" + critperlevel + ", spellblockperlevel=" + spellblockperlevel + ", crit=" + crit + ", mpregen=" + mpregen + ", spellblock=" + spellblock + ", hpregen=" + hpregen + ", hpperlevel=" + hpperlevel + '}';
    }
}
