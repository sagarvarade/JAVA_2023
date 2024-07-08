package com_old_package.java8.eg.Tutorial;

import java.util.List;

public class ReplaceText {
	private static String TEXT="""
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ACQ|01_ACQ_SUCCESS', '1;01_ACQ_SUCCESS_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|01_ACQ_SUCCESS|header1=LAPORAN AKTIVITAS ACQUIRER|header2=TRANSAKSI POINT OF SALE BERHASIL|reportCode=54|FILE=Acquirer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ACQ|02_ACQ_CANCEL', '2;02_ACQ_CANCEL_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|02_ACQ_CANCEL|header1=LAPORAN AKTIVITAS ACQUIRER|header2=TRANSAKSI POINT OF SALE BERHASIL -PEMBATALAN|reportCode=54A|FILE=Acquirer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ACQ|03_ACQ_FAILED', '3;03_ACQ_FAILED_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|03_ACQ_FAILED|header1=LAPORAN AKTIVITAS ACQUIRER|header2=TRANSAKSI POINT OF SALE GAGAL|reportCode=54B|FILE=Acquirer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ACQ|04_ACQ_SUSPECT', '4;04_ACQ_SUSPECT_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|04_ACQ_SUSPECT|header1=LAPORAN AKTIVITAS ACQUIRER|header2=TRANSAKSI POINT OF SALE SUSPECT|reportCode=54C|FILE=Acquirer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ACQ|05_ACQ_RECON', '5;05_ACQ_RECON_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|05_ACQ_RECON|header1=LAPORAN AKTIVITAS ACQUIRER|header2=TRANSAKSI POINT OF SALE HASIL REKON|reportCode=54D|FILE=Acquirer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ACQ|06_ACQ_SETTLE', '6;06_ACQ_SETTLE_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|06_ACQ_SETTLE|header1=LAPORAN AKTIVITAS ACQUIRER|header2=TRANSAKSI POINT OF SALE HASIL REKON (SETTLEMENT MANUAL)|reportCode=54E|FILE=Acquirer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ACQ|07_ACQ_NON_SETTLED', '7;07_ACQ_NON_SETTLED_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|07_ACQ_NON_SETTLED|header1=LAPORAN AKTIVITAS ACQUIRER|header2=TRANSAKSI POINT OF SALE HASIL TIDAK TER-SETTLE|reportCode=54F|FILE=Acquirer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ACQ|08_ACQ_CLEARING', '8;08_ACQ_CLEARING;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|08_ACQ_CLEARING|header1=I N F O R M A S I  H A K  B A N K|header2=TOTAL HAK YANG DITERIMA DARI |reportCode=06|FILE=Acquirer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT|SKIP_REPORT_KEY=360003');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ISS|09_ISS_SUCCESS', '9;09_ISS_SUCCESS_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|09_ISS_SUCCESS|header1=LAPORAN AKTIVITAS ISSUER|header2=TRANSAKSI POINT OF SALE BERHASIL|reportCode=56|FILE=Issuer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ISS|10_ISS_CANCEL', '10;10_ISS_CANCEL_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|10_ISS_CANCEL|header1=LAPORAN AKTIVITAS ISSUER|header2=TRANSAKSI POINT OF SALE BERHASIL -PEMBATALAN|reportCode=56A|FILE=Issuer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ISS|11_ISS_FAILED', '11;11_ISS_FAILED_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|11_ISS_FAILED|header1=LAPORAN AKTIVITAS ISSUER|header2=TRANSAKSI POINT OF SALE GAGAL|reportCode=56B|FILE=Issuer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ISS|12_ISS_SUSPECT', '12;12_ISS_SUSPECT_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|12_ISS_SUSPECT|header1=LAPORAN AKTIVITAS ISSUER|header2=TRANSAKSI POINT OF SALE SUSPECT|reportCode=56C|FILE=Issuer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ISS|13_ISS_RECON', '13;13_ISS_RECON_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|13_ISS_RECON|header1=LAPORAN AKTIVITAS ISSUER|header2=TRANSAKSI POINT OF SALE HASIL REKON|reportCode=56D|FILE=Issuer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ISS|14_ISS_SETTLE', '14;14_ISS_SETTLE_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|14_ISS_SETTLE|header1=LAPORAN AKTIVITAS ISSUER|header2=TRANSAKSI POINT OF SALE HASIL REKON (SETTLEMENT MANUAL)|reportCode=56E|FILE=Issuer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ISS|15_ISS_NON_SETTLED', '15;15_ISS_NON_SETTLED_STATIC;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|15_ISS_NON_SETTLED|header1=LAPORAN AKTIVITAS ISSUER|header2=TRANSAKSI POINT OF SALE HASIL TIDAK TER-SETTLE|reportCode=56F|FILE=Issuer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT');
insert into renaissance_property (category, property_name, property_value) VALUES ('3285_static_batch', '360003|ISS|16_ISS_CLEARING', '16;16_ISS_CLEARING;BANKCODE=360003|BANKNAME=ALT|batchKey=360003|16_ISS_CLEARING|header1=N O T A  K R E D I T|header2=KAMI KREDIT REKENING SAUDARA SEBESAR|reportCode=03|FILE=Issuer|reportDate={nextDate}{dateFormat=dd/MM/yyyy}|BANKCODE_FOR_FILE_NAME=ALT|SKIP_REPORT_KEY=360003');
			""";
	public static void main(String[] args) {
		
//		10000000422	BSR	Bank BRI Syariah		
//		10000000122	KAS	BPD Kalsel

/*		
 		10000000427	BIS	Bank BNI Syariah
		10000000422	BSR	Bank BRI Syariah
		10000000122	KAS	BPD Kalsel
		10000000451	BSM	Bank Syariah Mandiri
		10000000157	BMI	Bank Maspion
		10000000564	MTP	BANK MANTAP
		10000000947	BAL	BANK ALADIN
		10000000133	BKL	Bank Bengkulu
		10000000130	NUT	BANK NTT
		10000000121	LMP	Bank Lampung
		10000000164	CBC	Bank ICBC
		10000000998	DSP	Digital Solusi Pratama
		10000000134	SUL	Bank Sulteng

*/
		List<String> al=
List.of("10000000427@@BIS@@Bank BNI Syariah",
"10000000422@@BSR@@Bank BRI Syariah",
"10000000122@@KAS@@BPD Kalsel",
"10000000451@@BSM@@Bank Syariah Mandiri",
"10000000157@@BMI@@Bank Maspion",
"10000000564@@MTP@@BANK MANTAP",
"10000000947@@BAL@@BANK ALADIN",
"10000000133@@BKL@@Bank Bengkulu",
"10000000130@@NUT@@BANK NTT",
"10000000121@@LMP@@Bank Lampung",
"10000000164@@CBC@@Bank ICBC",
"10000000998@@DSP@@Digital Solusi Pratama",
"10000000134@@SUL@@Bank Sulteng");

		for(String str:al) {
		String [] ar=str.split("@@");
		
		String t2=
				 TEXT.replaceAll("360003", ar[0].substring(ar[0].length()-3))
                .replaceAll("BANKNAME=ALT", "BANKNAME="+ar[2])
                .replaceAll("BANKCODE_FOR_FILE_NAME=ALT", "BANKCODE_FOR_FILE_NAME="+ar[1]);
		System.out.println(t2);
		}
	}

}
