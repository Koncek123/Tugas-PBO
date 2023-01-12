
# List Modul Tugas Teori PBO



## Documentation
### Modul 1
* [Jawaban Modul 1](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/Jawaban%20Modul%201.txt) 

### Modul 3

* [Hello_World2](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_12092022/Hello_Word2.java)
  
  - Untuk mendapatkan output tampil pada gambar kita dapat menggunakan intruksi
    ```
      System.out.println(" ");
    ```
    atau
    ```
      System.out.print(" ");
    ```
  - Perbedaannya terletak pada "ln". Jika menggunakan ln maka program otomatis mengambil baris baru setelah menjalankan instruksi.
  - gunakan " " jika outputnya berupa teks, atau langsung tanpa "" jika merupakan variable
  - gunakan + sebagai penghubung antar ekspresi
* [The Tree](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_12092022/TheTree.java)
  - ada beberapa metode untuk membuat baris baru pada sebuah output
    1.Membuat \n di dalama " " jika menggunakan ``` System.out.print(" ") ``` . Tentunya ditulis setelah kalimatnya
    2.Menggunakan perintah ``` System.out.println(" "); ```
### Modul 4
* [4.11.1 Mendeklarasikan dan mencetak variabel](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p21092022/Latihan1Fajar.java)
  
  Pada program Latihan1.java mendeklarasikan beberapa variabel yaitu

  - number dengan tipe data integer dengan nilai 10
  - letter dengan tipe data char dengan nilai 'a'
  - result dengan tipe data boolean bernilai true
  - str dengan tipe data string dengan nilai "Hello"
  selanjutnya gunakan perintah System.out.println yang digunakan untuk menampilkan teks. pada perintah tersebut melakukan pemanggilan variabel dengan menggunakan simbol + sesudah tanda petik. lalu variabel yang sudah dideklarasikan yaitu variabel number, letter, result, dan str akan ditampilkan.
* [4.11.2. Mendapatkan nilai rata-rata dari tiga angka](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p21092022/Latihan2Fajar.java)

  Pada program Latihan2.java mendeklarasikan beberapa variabel yaitu

  - number1 dengan tipe data integer dengan nilai 10
  - number2 dengan tipe data integer dengan nilai 20
  - number3 dengan tipe data integer dengan nilai 45
  - average dengan tipe data double

  lalu variabel average nilainya didapatkan dari rata-rata dari nilai number1, number2, dan number3.

  selanjutnya gunakan perintah System.out.println yang digunakan untuk menampilkan teks. pada perintah tersebut melakukan pemanggilan variabel dengan menggunakan simbol + sesudah tanda petik. lalu variabel yang sudah dideklarasikan yaitu variabel number1, number2, number3, dan average akan ditampilkan.
* [4.11.3. Menampilkan nilai terbesar](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p21092022/Latihan3Fajar.java)

  Pada program Latihan3.java mendeklarasikan beberapa variabel yaitu

  - number1 dengan tipe data integer dengan nilai 10
  - number2 dengan tipe data integer dengan nilai 23
  - number3 dengan tipe data integer dengan nilai 5
  - max dengan tipe data integer
  
  Lalu memproses nilai variabel max menggunakan operator kondisi yang digunakan untuk menentukan nilai max dari 3 variabel.

  Selanjutnya gunakan perintah System.out.println yang digunakan untuk menampilkan teks. pada perintah tersebut melakukan pemanggilan variabel yang sudah dideklarasikan yaitu variabel number1, number2, number3, dan max akan ditampilkan.
* [4.11.4. Operator precedence](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p21092022/PrecedenceFajar.java)

  Pada program Precedence.java menggunakan perintah System.out.println yang digunakan untuk menampilkan teks. pada perintah menampilkan beberapa teks seperti

  1. a/(b^(c^d)-e+f-(g*h)+i
  2. (310)(2/15)-2+(4^(2^2))
  3. (((r^s)*t)/u)-v+(w^x)-y++

### Modul 5
* [5.1.1 Kata Terakhir (versi BufferedReader)](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p05102022/Latihan4.java)

  program latihan4.java menggunakan buffered reader. buffered reader merupakan suatu Class di Java yang berfungsi untuk menyederhanakan pembacaan teks dan dalam menginputkan suatu teks. pada program latihan1.java membuat beberapa variabel untuk pemanggilan class buffered reader, yaitu

    - import java.io.BufferedReader
    - import java.io.IOException
    - import java.io.InputStreamReader
  
  Pada program latihan4.java mendeklarasikan beberapa variabel seperti word1, word2, dan word3 dengan tipe data string. lalu pada kode try dapat melakukan penginputan user dari variabel yang sudah dideklarasikan. teks yang diinputkan yaitu "Goodbye", "and", "Hello" pada masing" variabel.

  setelah itu melakukan pemanggilan variabel yang sudah menginputkan sebuah teks menggunakan perintah System.out.println
  
* [5.1.2 Kata Terakhir (versi JOptionPane)](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p05102022/Latihan5.java)

  program latihan5.java menggunakan JOptionPane. JOptionPane merupakan suatu Class di Java yang berfungsi menampilkan jendela dialog yang digunakan untuk menampilkan dan menginputkan sebuah teks. pada program latihan2.java membuat variabel untuk pemanggilan class JOptionPane yaitu import javax.swing.JOptionPane yang digunakan untuk menjalankan class JOptionPane.

  Pada program latihan5.java mendeklarasikan beberapa variabel seperti word1, word2, dan word3 dengan tipe data string. pada kode ```JOptionPane.showInputDialog();``` digunakan untuk menginputkan teks menggunakan JOptionPane. data yang diinputkan yaitu "Goodbye", "and", "Hello".

  Lalu data yang sudah diinputkan nilainya akan ditampung pada variabel "msg" dan data yang ditampung akan ditampilkan pada kode perintah ```JOptionPane.showMessageDialog(null, msg);```
  
  
### Modul 6
* [6.5.1 Nilai]
  * [BufferedReader](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan5.java)
    
    program latihan5.java menggunakan class buffered reader yang digunakan untuk melakukan proses input pada sebuah variabel. pada program latihan5.java mendeklarasikan variabel n1, n2, dan n3 dengan tipe data integer dan variabel rata dengan tipe data float.

    pada program latihan5.java menggunakan kode try dapat melakukan penginputan dari variabel n1, n2, dan n3. setelah itu melakukan proses mencari rata-rata pada ketiga nilai yang sudah diinputkan yang nilainya disimpan pada variabel rata.

    selanjutnya terdapat kondisi jika nilai rata lebih besar atau sama dengan 60, maka output yang ditampilkan ":D". dan jika nilai rata lebih kecil dari 60 maka output yang ditampilkan ":("
    
  * [JOptionPane](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan6.java)
    
      program latihan6.java menggunakan class JOptionPane yang digunakan untuk melakukan proses input dan menampilkan teks dalam jendela dialog. pada program latihan1B.java mendeklarasikan variabel n1, n2, dan n3 dengan tipe data integer, variabel rata dengan tipe data float, dan variabel msg dengan tipe data string

    pada program latihan1B.java menggunakan kode "JOptionPane.showInputDialog();" digunakan untuk menginputkan teks pada variabel n1, n2, dan n3. setelah itu mencari nilai rata-rata dari ketiga nilai tersebut yang disimpan pada variabel rata.

    selanjutnya terdapat kondisi jika nilai rata lebih besar atau sama dengan 60, maka output yang ditampilkan ":D" karena msg diisi dengan kalimat ":D". sedangkan jika nilai rata lebih kecil dari 60 maka output yang ditampilkan ":(" karena msg diisi dengan kalimat ":(".

* [6.5.2 Membaca Bilangan](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan7.java)

  program latihan7.java menjelaskan bagaimana penggunaan switch-case dengan metode input scanner. perintah akan dijalankan sesuai dengan case yang diinputkan. jika 1 maka "satu", jika 2 maka "dua", dan seterusnya hingga 10
  
* [6.5.3 Cetak Seratus Kali](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan8.java)
  
  program latihan 8 menjelaskan bagaimana mencetak nama 100 kali dengan looping dan class BufferedReader. ketika variabel nama yang berupa string diinput sebuah nama, maka nama tersebut akan tercetak 100 kali
  
* [6.5.4 Perpangkatan](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan9.java)
  
  program latihan 9 menjelaskan bagaimana membuat operasi perpangkatan menggunakan looping dan class BufferedReader. prosesnya buat sebuah variabel sakaligus diinisialisasikan beberapa, diantaranya angka=0, pangkat=0, dan kali=1. kemudian input angka beserta pangkat. lalu dilooping sebanyak pangkat-1 perkalian kali=kali*angka
  
### Modul 7
* [7.7.1 Hari dalam seminggu]()
* [7.7.2 Nomor terbesar]()
* [7.7.3 Buku Alamat]

### Modul 8
* [8.4.1   Mencetak Argument]()
* [8.4.2   Operasi Aritmatik]()

### Modul 9
* [9.6.1  Mendefinisikan Istilah]()
* [9.6.2  Java Scavanger Hunt]()

### Modul 10
* [10.10.1 Entry Buku Alamat]()
* [10.10.2 Buku Alamat]()

### Mudul 11
* [11.6.1   Extend StudentRecord]()
* [11.6.2   Bentuk Abstract Class]()

### Moudul 12
* [12.4.1  Menangkap Exception 1]()
* [12.4.2  Menangkap Exception 2]()
