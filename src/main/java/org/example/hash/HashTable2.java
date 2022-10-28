package org.example.hash;

import java.util.ArrayList;
import java.util.List;

public class HashTable2 {

    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }
    private int size = 1000;
    private List<Node>[] table = new ArrayList[1000];

    public HashTable2() {
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % this.size;
    }

    public void insert(String key, int value){
        int hashIdx = hash(key);
        if(this.table[hashIdx] == null){
            this.table[hashIdx] = new ArrayList<>();
        }
        this.table[hashIdx].add(new Node(key,value));
    }

    public Integer get(String key){
        List<Node> nodes = this.table[hash(key)];
        for (Node node:nodes
             ) {
            if(key.equals(node.getKey())){
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] names = new String[]{ "Seoyoon","Yoonseo",
                "DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable2 ht = new HashTable2();

        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));
        }

        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            if(ht.get(names[i]) != null){
                sum += 1;
            }
        }
        System.out.println(sum);
        System.out.println(ht.get("Seoyoon"));
        System.out.println(ht.get("Yoonseo"));
    }
}
