# HardDiskStatistics
To compute the Hard Disk Statistics (Codility Challange)

A string is passed S= "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"
which contains difference types of files with there sizes separted with next line.

You need to calculate the size being used by each types of file. The different types should be considered as one:
Music --> mp3, aac and flac
Images --> jpg, bmp and gif
Movies --> mp4, avi, mkv
Others --> txt, exe, etc..

The final output should give the total size of each type eg:
movies 10200b
music 1011b
others 105b
