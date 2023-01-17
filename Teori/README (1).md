
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
  ```
  Pada program Latihan1.java mendeklarasikan beberapa variabel yaitu

  - number dengan tipe data integer dengan nilai 10
  - letter dengan tipe data char dengan nilai 'a'
  - result dengan tipe data boolean bernilai true
  - str dengan tipe data string dengan nilai "Hello"
  selanjutnya gunakan perintah System.out.println yang digunakan untuk menampilkan teks. pada perintah tersebut melakukan pemanggilan variabel dengan menggunakan simbol + sesudah tanda petik. lalu variabel yang sudah dideklarasikan yaitu variabel number, letter, result, dan str akan ditampilkan.
  
* [4.11.2. Mendapatkan nilai rata-rata dari tiga angka](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p21092022/Latihan2Fajar.java)
  ```
  Pada program Latihan2.java mendeklarasikan beberapa variabel yaitu

  - number1 dengan tipe data integer dengan nilai 10
  - number2 dengan tipe data integer dengan nilai 20
  - number3 dengan tipe data integer dengan nilai 45
  - average dengan tipe data double

  lalu variabel average nilainya didapatkan dari rata-rata dari nilai number1, number2, dan number3.

  selanjutnya gunakan perintah System.out.println yang digunakan untuk menampilkan teks. pada perintah tersebut melakukan pemanggilan variabel dengan menggunakan simbol + sesudah tanda petik. lalu variabel yang sudah dideklarasikan yaitu variabel number1, number2, number3, dan average akan ditampilkan.
  
* [4.11.3. Menampilkan nilai terbesar](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p21092022/Latihan3Fajar.java)
  ```
  Pada program Latihan3.java mendeklarasikan beberapa variabel yaitu

  - number1 dengan tipe data integer dengan nilai 10
  - number2 dengan tipe data integer dengan nilai 23
  - number3 dengan tipe data integer dengan nilai 5
  - max dengan tipe data integer
  
  Lalu memproses nilai variabel max menggunakan operator kondisi yang digunakan untuk menentukan nilai max dari 3 variabel.

  Selanjutnya gunakan perintah System.out.println yang digunakan untuk menampilkan teks. pada perintah tersebut melakukan pemanggilan variabel yang sudah dideklarasikan yaitu variabel number1, number2, number3, dan max akan ditampilkan.
  
* [4.11.4. Operator precedence](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p21092022/PrecedenceFajar.java)
  ```
  Pada program Precedence.java menggunakan perintah System.out.println yang digunakan untuk menampilkan teks. pada perintah menampilkan beberapa teks seperti

  1. a/(b^(c^d)-e+f-(g*h)+i
  2. (310)(2/15)-2+(4^(2^2))
  3. (((r^s)*t)/u)-v+(w^x)-y++

### Modul 5
* [5.1.1 Kata Terakhir (versi BufferedReader)](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p05102022/Latihan4.java)
  ```
  program latihan4.java menggunakan buffered reader. buffered reader merupakan suatu Class di Java yang berfungsi untuk menyederhanakan pembacaan teks dan dalam menginputkan suatu teks. pada program latihan1.java membuat beberapa variabel untuk pemanggilan class buffered reader, yaitu

    - import java.io.BufferedReader
    - import java.io.IOException
    - import java.io.InputStreamReader
  
  Pada program latihan4.java mendeklarasikan beberapa variabel seperti word1, word2, dan word3 dengan tipe data string. lalu pada kode try dapat melakukan penginputan user dari variabel yang sudah dideklarasikan. teks yang diinputkan yaitu "Goodbye", "and", "Hello" pada masing" variabel.

  setelah itu melakukan pemanggilan variabel yang sudah menginputkan sebuah teks menggunakan perintah System.out.println
  
* [5.1.2 Kata Terakhir (versi JOptionPane)](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p05102022/Latihan5.java)
  ```
  program latihan5.java menggunakan JOptionPane. JOptionPane merupakan suatu Class di Java yang berfungsi menampilkan jendela dialog yang digunakan untuk menampilkan dan menginputkan sebuah teks. pada program latihan2.java membuat variabel untuk pemanggilan class JOptionPane yaitu import javax.swing.JOptionPane yang digunakan untuk menjalankan class JOptionPane.

  Pada program latihan5.java mendeklarasikan beberapa variabel seperti word1, word2, dan word3 dengan tipe data string. pada kode ```JOptionPane.showInputDialog();``` digunakan untuk menginputkan teks menggunakan JOptionPane. data yang diinputkan yaitu "Goodbye", "and", "Hello".

  Lalu data yang sudah diinputkan nilainya akan ditampung pada variabel "msg" dan data yang ditampung akan ditampilkan pada kode perintah ```JOptionPane.showMessageDialog(null, msg);```
  
  
### Modul 6
* [6.5.1 Nilai]
  * [BufferedReader](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan5.java)
    ```
    program latihan5.java menggunakan class buffered reader yang digunakan untuk melakukan proses input pada sebuah variabel. pada program latihan5.java mendeklarasikan variabel n1, n2, dan n3 dengan tipe data integer dan variabel rata dengan tipe data float.

    pada program latihan5.java menggunakan kode try dapat melakukan penginputan dari variabel n1, n2, dan n3. setelah itu melakukan proses mencari rata-rata pada ketiga nilai yang sudah diinputkan yang nilainya disimpan pada variabel rata.

    selanjutnya terdapat kondisi jika nilai rata lebih besar atau sama dengan 60, maka output yang ditampilkan ":D". dan jika nilai rata lebih kecil dari 60 maka output yang ditampilkan ":("
    
  * [JOptionPane](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan6.java)
    ```
      program latihan6.java menggunakan class JOptionPane yang digunakan untuk melakukan proses input dan menampilkan teks dalam jendela dialog. pada program latihan1B.java mendeklarasikan variabel n1, n2, dan n3 dengan tipe data integer, variabel rata dengan tipe data float, dan variabel msg dengan tipe data string

    pada program latihan1B.java menggunakan kode "JOptionPane.showInputDialog();" digunakan untuk menginputkan teks pada variabel n1, n2, dan n3. setelah itu mencari nilai rata-rata dari ketiga nilai tersebut yang disimpan pada variabel rata.

    selanjutnya terdapat kondisi jika nilai rata lebih besar atau sama dengan 60, maka output yang ditampilkan ":D" karena msg diisi dengan kalimat ":D". sedangkan jika nilai rata lebih kecil dari 60 maka output yang ditampilkan ":(" karena msg diisi dengan kalimat ":(".

* [6.5.2 Membaca Bilangan](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan7.java)
  ```
  program latihan7.java menjelaskan bagaimana penggunaan switch-case dengan metode input scanner. perintah akan dijalankan sesuai dengan case yang diinputkan. jika 1 maka "satu", jika 2 maka "dua", dan seterusnya hingga 10
  
* [6.5.3 Cetak Seratus Kali](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan8.java)
  ```
  program latihan 8 menjelaskan bagaimana mencetak nama 100 kali dengan looping dan class BufferedReader. ketika variabel nama yang berupa string diinput sebuah nama, maka nama tersebut akan tercetak 100 kali
  
* [6.5.4 Perpangkatan](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_19102022/latihan9.java)
  ```
  program latihan 9 menjelaskan bagaimana membuat operasi perpangkatan menggunakan looping dan class BufferedReader. prosesnya buat sebuah variabel sakaligus diinisialisasikan beberapa, diantaranya angka=0, pangkat=0, dan kali=1. kemudian input angka beserta pangkat. lalu dilooping sebanyak pangkat-1 perkalian kali=kali*angka
  
### Modul 7
* [7.7.1 Hari dalam seminggu](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_26102022/latihan2.java)
  ```
  Program dengan tujuan membuat sebuah program looping memanggil nama-nama hari degan metode for-loop dan while-loop
  - for-loop
      
      Dimulai membuat variabel array hari dan masukkan data hari ke array. lalu lakukan perulangan for sepanjang variabel hari. setelah itu di dalam for loop dibuat         perintah output array hari dengan penomoran indeks dibantu variabel yang ada dalam for loop
      
  - while-loop
      
       Dimulai membuat variabel array hari dan masukkan data hari ke array. membuat deklarasi variabel j yang dimulai dari 0. Kemudian membuat sisten while loop dengan        ketentuan "selama j<panjang array hari". di dalam while loop kita buat statement if dengan ketentuan j!=0 untuk memberikan jarak antar array. di bawah operasi          if kita panggil harinya dan di bawahnya kita buat perintah increament.
* [7.7.2 Nomor terbesar](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_26102022/latihan3.java)
  ```
      Program dengan tujuan melakukan pencarian nilai terbesar dari 3 angka dengan menggunakan class BufferedReader dan looping for-loop
      - Membuat variabel array dan batas indeks
      - membuat variabel max dengan nilai -999
      - membuat sistem bufferedreader
      - masukkan operasi try dan cath di dalam for loop untuk membuat operasi input angka
      - di luar for-loop (tepatnya setelahnya) buat operasi for-loop baru untuk memanggil angka yang diiputkan
      - setelah operasi for-loop sebelumnya, buat operasi for-loop lagi untuk menyeleksi (mencari) niai maksimal. di dalam ini kita buat operasi if dengan ketentuan           "jika angka [i]> max maka max=angka[i]".
      - setelah operasi for loop kita buat statement untuk memanggil nilai max
      
* [7.7.3 Buku Alamat](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_26102022/latihan4.java)
  ```
      Program dengan tujuan memanggil alamat yamg dibuat dalam bentuk array 2 dimensi
      - membuat variabel array 2 dimensi serta data dalam array
      - membuat for-loop sepanjang array
      - membuat 3 output untuk memanggil kolom array dengan baris=i pada for-loop


### Modul 8
* [8.4.1   Mencetak Argument](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_26102022/latihan6.java)
     ```
     Program untuk Memproses dan menginputkan nilai menggunakan argumen command-line. dalam menggunakan command-line, setiap nilai yang diinputkan nilainya dihitung        dalam satuan index yang dimulai dari index 0. cara mengoperasikan perintah command-line dengan cara klik properti pada projek anda, lalu pilih run, browse file        yang diinginkan, dan masukkan nilai argumennya.
     
     -  buat class default void main ``` public static void main( String[] args ) ```
     -  buat for-loop di dalamnya
     -  buat statement output dalam for-loop dengan memanggil args[i]. i diperoleh dari variabel dalam for-loop
      
* [8.4.2   Operasi Aritmatik](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/fajar_26102022/latihan7.java)

    ```
    program sama dengan program sebelumnya, bedanya ini digunakan untuk menjalankan opersi penjumlahan
    - buat variabel a untuk nilai 1 dan statement input yang diperoleh dari args[0]
    - buat variabel b untuk nilai 2 dan statement input yang diperoleh dari args[1]
    - buat variabel aritmatika kabataku dengan tipe data int
    - membuat bentuk operasinya di dalam masing-masing variabel
    - memanggil output masing-masing variabel untuk melihat hasil 


### Modul 9
* 9.6.1  Mendefinisikan Istilah

  ```
  1.  `Class` Class adalah sturktur dasa dari OOP. Dia terdiri dari dua tipe dari anggota dimana disebut dengan field (attribut/properti) dan method. Field mespesifikasi tipe data yang didefinisikan oleh class, sementara methode spesifikasi dari operasi.
  2.  `Object` Object adalah entitas yang memiliki atribut, karakter (bahavour) dan kadang kala disertai kondisi (state) (Douglas, 1992). Pemrograman berorientasi objek ditemukan pada Tahun 1960, dimana berawal dari suatu pembuatan program yang terstruktur (structured programming).
  3.  `Instantiate` Instantiate adalah membuat instance objek dalam bahasa pemrograman berorientasi objek (OOP). Objek instantiated diberi nama dan dibuat dalam memori atau pada disk menggunakan struktur yang dijelaskan dalam deklarasi kelas.
  4.  `Intance Variable` Variabel instance merupakan variabel yang menjadi milik objek yang merupakan instance dari class tertentu. Ini berarti bahwa setiap objek dari class tersebut dapat memiliki nilai variabel instance yang berbeda.
  5.  `Instance Method` Method instance adalah fungsi yg beroperasi pada objek untuk memanipulasi state objek lewat pesan yg diterima dari objek lain. Untuk memanggil method ini harus membuat objek dengan instance class.
  6.  `Class Variable` Variabel class di sisi lain adalah milik class yang bersangkutan. Ini berarti bahwa setiap objek dari class tersebut akan berbagi nilai variabel class yang sama. Untuk mendeklarasikan variabel class, ditambahkan modifier static sebelum tipe data. Variabel ini dapat digunakan untuk mendeklarasikan konstanta.
  7.  `Constructor` Constructor adalah method khusus yang akan dieksekusi pada saat pembuatan objek (instance).Biasanya method ini digunakan untuk inisialisasi atau mempersiapkan data untuk objek.

* [9.6.2  Java Scavanger Hunt]()

### Modul 10
* [10.10.1 Entry Buku Alamat](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/modul10/BukuAlamat.java)
  ```
  Pada program BukuAlamat.java merupakan program membuat sebuah class yang berisikan beberapa method dan constructor di dalamnya yang akan di proses pada main class.
  Pada class BukuAlamat ini akan terdapat method untuk mengisikan (Nama, Alamat, Nomor Telepon, dan Email).Method tersebut terdiri dari Acessor dan Mutator method.
  Acessor Method berfungsi untuk membaca suatu nilai pada class, acessor method ini umumnya dimulai dengan penulisan get. Lalu Mutator method berfungsi untuk mengatur
  atau mengisi suatu nilai pada class,mutator ini umumnya dimulai dengan penulisan set. Semua method pada class ini akan diproses pada main class yaitu          
  BukuAlamatExample.java
* [10.10.2 Buku Alamat](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/modul10/BukuAlamatExample.java)
  ```
  Pada program BukuAlamatExample.java merupakan main class untuk memproses class BukuAlamat.java sebelumnya. Pada class ini kita akan membuat class BukuAlamat yang 
  dapat menampung 100 data. Lalu pada class main ini kita akan bisa untuk mengentri data, menghapus data, menampilkan data, dan update data. Untuk membuat 4 menu yang 
  disebutkan tadi, kita akan menggunakan statement swicth case untuk menjalankannya

### Mudul 11
* [11.6.1   Extend StudentRecord](https://github.com/Koncek123/Tugas-PBO/tree/main/Teori/PBO_2101092001/src/Modul11_lat1)
  - [StudentRecord](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/Modul11_lat1/StudentRecord.java)
    ```
    Pada program StudentRecord.java merupakan class yang berisi beberapa method dan constructor. Method pada class ini akan mengembalikan nilai berupa (Nama, alamat, 
    umur, nilai mtk, nilai sains, nilai .inggris). Class ini merupakan Super class yang mana akan di extend oleh subClass yang akan dibuat, yaitu pada class Komputer.java . 
    Karena class ini akan menurunkan method atau varibael di dalamnya, maka dalam mendeklarasikan varibael kita kan menggunnakan tipe protected.
    
  - [Komputer](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/Modul11_lat1/Komputer.java)
    ```
    Pada program Komputer.java merupakan subClass yang meng-extend dari super class yaitu StudentRecord.java. Pada class ini catatan siswa yang lebih khusus yaitu 
    informasi tambahan mengenai ilmu pengetahuan komputer siswa.
    
  - [StudentRecordExample](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/Modul11_lat1/StudentRecordExample.java)
    ```
    Pada program StudentRecordExample.java merupakan main class untuk memproses Super class dan Sub class yang telah dibuat. Untuk menggunakan Super Class kita bisa 
    mendeklarasikann objeknya seperti kita mendeklarasikan suatu varibale. Lalu objek Super class ini akan kita isi juga objek Sub class Komputer.java di dalamnya, 
    agar kita bisa menampilkan informasi yang ada pada Sub class Komputer tersebut.
    
* [11.6.2   Bentuk Abstract Class](https://github.com/Koncek123/Tugas-PBO/tree/main/Teori/PBO_2101092001/src/Modul11_lat2)
  - [Shape](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/Modul11_lat2/Shape.java)
    ```
    Pada program Shape.java merupakan sebuah Abstrac class yang berisikan method getName() dan getArea(). Method tersebut akan diturunkan ke Sub class yaitu 
    Circle.java dan Square.java . Pada Sub class kita dapat menambahkan informasi yang lebih rinci pada masing-masing Sub class tersebut.
    
  - [Circle](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/Modul11_lat2/Circle.java)
    ```
    Pada program Circle.java merupakan Sub Class yang meng extend class Shape.java . Pada class ini kita akan mencari nama dan luas lingkaran menggunakan method Set 
    yang di buat pada class ini dan Method Get dari extend class Shape.java. Jadi, Sub class ini membuat informasi lebih rinci dari sebuah Shape Circle.
    
  - [Square](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/Modul11_lat2/Square.java)
    ```
    Pada program Square.java merupakan Sub Class yang meng extend class Shape.java . Pada class ini kita akan memasukkan nilai nama dan luas Persegi menggunakan method 
    Set yang di buat pada class ini dan Method Get dari extend class Shape.java . Jadi, Sub class ini membuat informasi lebih rinci dari sebuah Shape Square.
    
  - [ShapeExample](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/Modul11_lat2/ShapeExample.java)
    ```
    Pada program ShapeExample.java merupakan main class ini menjalankan proses dari Sub class yang telah di buat. Kita bisa membuat masing-masing objek untuk Sub class 
    tersebut. Ketika kita menggunakan objek Sub class Circle, lalu kita menggunakan method set untuk mengatur nilanya, maka output yang akan di tampilkan adalah Nilai 
    getNama() dan getArea() dari Sub class Circle tersebut. Begitu juga pada objek Sub class Square.
    
### Moudul 12
* [12.4.1  Menangkap Exception 1](https://github.com/Koncek123/Tugas-PBO/blob/main/Teori/PBO_2101092001/src/com/fajar/p07122022/TestExceptions.java)
  ```
  Pada program TestException.java merupakan program untuk menangani kondisi yang tidak biasa dalam menjalankan operasi normal dalam program. Jadi, ketika terjadi 
  Exception kita bisa mengarahkannya atau menampilkan informasi sederhana sesuai yang kita inginkan. Pada program ini apabila terjadi exception pada Argument command 
  line maka akan di tampilkan "java.lang.ArrayIndexOutOfBoundsException: 3 Quiting..."
  
* [12.4.2  Menangkap Exception 2]()
