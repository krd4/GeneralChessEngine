package chessengine.general
package core

import core.{Player, Board}

case class Game(turn: Player, turn_num: Int, players: Array[Player], board: Board)