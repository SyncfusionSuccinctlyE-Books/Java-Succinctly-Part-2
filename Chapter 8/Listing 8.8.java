	// This event is called when the timer fires at the specified fps
	public void actionPerformed(ActionEvent e) {
		// Read the most up-to-date time:
		hpTimer.update();
		
		// Pass HPTimer's times to our update method:
		update(hpTimer.timeTotal(), hpTimer.timeDelta());
		
		repaint();
	}
