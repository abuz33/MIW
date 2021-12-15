package com.chess.gui;

import com.chess.engine.board.Move;
import com.chess.engine.pieces.Piece;
import com.chess.gui.Table.MoveLog;
import com.google.common.primitives.Ints;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serial;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;


class TakenPiecesPanel extends JPanel {

    private final JPanel northPanel;
    private final JPanel southPanel;
    @Serial
    private static final long serialVersionUID = 1L;
    private static final Color PANEL_COLOR = Color.decode("0xFDF5E6");
    private static final Dimension TAKEN_PIECES_PANEL_DIMENSION = new Dimension(40, 80);
    private static final EtchedBorder PANEL_BORDER = new EtchedBorder(EtchedBorder.RAISED);

    public TakenPiecesPanel() {
        super(new BorderLayout());
        setBackground(PANEL_COLOR);
        setBorder(PANEL_BORDER);
        this.northPanel = new JPanel(new GridLayout(8, 2));
        this.southPanel = new JPanel(new GridLayout(8, 2));
        this.northPanel.setBackground(PANEL_COLOR);
        this.southPanel.setBackground(PANEL_COLOR);
        this.add(this.northPanel, BorderLayout.NORTH);
        this.add(this.southPanel, BorderLayout.SOUTH);
        setPreferredSize(TAKEN_PIECES_PANEL_DIMENSION);
    }

    public void redo(final MoveLog moveLog) {
        southPanel.removeAll();
        northPanel.removeAll();
        final List<Piece> whiteTakenPieces = new ArrayList<>();
        final List<Piece> blackTakenPieces = new ArrayList<>();

        for (final Move move : moveLog.getMoves()) {
            if (move.isAttack()) {
                final Piece takenPiece = move.getAttackedPiece();

                if (takenPiece.getPieceAlliance().isWhite()) {
                    whiteTakenPieces.add(takenPiece);
                } else if (takenPiece.getPieceAlliance().isWhite()) {
                    blackTakenPieces.add(takenPiece);
                } else {
                    throw new RuntimeException("should not reach here");
                }
            }
        }

        Collections.sort(whiteTakenPieces, (o1, o2) -> Ints.compare(o1.getPieceValue(), o2.getPieceValue()));

        Collections.sort(whiteTakenPieces, (o1, o2) -> Ints.compare(o1.getPieceValue(), o2.getPieceValue()));

        for (final Piece piece : whiteTakenPieces) {
            try {
                final BufferedImage image = ImageIO.read(new File("art/holywarriors/" + piece.getPieceAlliance().toString().charAt(0) + "" + piece.toString() + ".gif"));
                final ImageIcon ic = new ImageIcon(image);
                final JLabel imageLabel = new JLabel();
                this.southPanel.add(imageLabel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (final Piece piece : blackTakenPieces) {
            try {
                final BufferedImage image = ImageIO.read(new File("art/holywarriors/" + piece.getPieceAlliance().toString().charAt(0) + "" + piece.toString() + ".gif"));
                final ImageIcon ic = new ImageIcon(image);
                final JLabel imageLabel = new JLabel();
                this.northPanel.add(imageLabel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//
//                try {
//                    final Piece takenPiece = move.getAttackedPiece();
//                    final BufferedImage image = ImageIO.read(new File(
//                            "art/holywarriors/" + takenPiece.getPieceAlliance().toString().charAt(0) + "" +
//                                    takenPiece.toString() + ".gif"));
//                    final ImageIcon ic = new ImageIcon(image);
//                    final JLabel imageLabel = new JLabel(new ImageIcon(ic.getImage().getScaledInstance(ic.getIconWidth() - 15, ic.getIconWidth() - 15, Image.SCALE_SMOOTH)));
//                    if (takenPiece.getPieceAlliance().isWhite()) {
//                        this.southPanel.add(imageLabel);
//                    } else if (takenPiece.getPieceAlliance().isBlack()) {
//                        this.northPanel.add(imageLabel);
//                    }
//                } catch (final IOException e) {
//                    e.printStackTrace();
//                }

        validate();
    }
}