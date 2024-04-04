package com.gooseplayer2.JPanels;

import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.*;

import com.gooseplayer2.Packages.Slugcat;

import javazoom.jl.decoder.JavaLayerException;

import java.awt.*;
import java.io.IOException;

public class MusicPanel extends JPanel {
    GridBagLayout layout;
    GridBagConstraints gbc;
    Border outline;

    public MusicPanel() throws UnsupportedAudioFileException, IOException, LineUnavailableException, JavaLayerException {

        layout = new GridBagLayout();
        gbc = new GridBagConstraints();
        setLayout(layout);

        outline = BorderFactory.createLineBorder(Color.BLACK);
        Slugcat Monk = new Slugcat();

        MusicPlayer player1 = new MusicPlayer(1);
        player1.add(new JLabel("Channel 1"));
        player1.setBorder(outline);

        MusicPlayer player2 = new MusicPlayer(2);
        player2.add(new JLabel("Channel 2"));
        player2.setBorder(outline);

        MusicPlayer player3 = new MusicPlayer(3);
        player3.add(new JLabel("Channel 3"));
        player3.setBorder(outline);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0; 
        gbc.weighty = 1.0;

        Monk.addObjects(player1, this, layout, gbc, 0, 0, 1, 1);
        Monk.addObjects(player2, this, layout, gbc, 0, 1, 1, 1);
        Monk.addObjects(player3, this, layout, gbc, 0, 2, 1, 1);

    }    
}
