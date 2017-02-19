/*
 * Copyright (C) 2017 Bruno Nova <brunomb.nova@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package brunonova.collision.core.actors;

import brunonova.collision.core.Collision;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;


/**
 * Base class for all game actors.
 */
public class BaseActor extends Actor {
    /** The game. */
    protected Collision game;
    /** The (optional) image of the actor. */
    protected Texture image;

    /**
     * Creates the actor.
     * @param game The game.
     */
    public BaseActor(Collision game) {
        this.game = game;
    }

    /**
     * Creates the actor.
     * @param game The game.
     * @param imageName File name of the image of the actor.
     */
    public BaseActor(Collision game, String imageName) {
        this(game);
        this.image = game.getImage(imageName);
    }
}
