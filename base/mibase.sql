PGDMP         -                w            MiBaseDeDatos    11.4    11.4                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    16393    MiBaseDeDatos    DATABASE     �   CREATE DATABASE "MiBaseDeDatos" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Ecuador.1252' LC_CTYPE = 'Spanish_Ecuador.1252';
    DROP DATABASE "MiBaseDeDatos";
             postgres    false            �            1259    16402 	   DIRECCION    TABLE     �   CREATE TABLE public."DIRECCION" (
    "DIR_CODIGO" numeric NOT NULL,
    "DIR_CALLE_PRINCIPAL" text,
    "DIR_CALLE_SECUNDARIA" text,
    "DIR_NUMERO" numeric(3,0),
    "DIR_CEDULA_PER" text
);
    DROP TABLE public."DIRECCION";
       public         postgres    false            �            1259    16394    PERSONA    TABLE     �   CREATE TABLE public."PERSONA" (
    "PER_CEDULA" text NOT NULL,
    "PER_NOMBRE" text,
    "PER_APELLIDO" text,
    "PER_EDAD" numeric(3,0),
    "PER_FECHA_NACIMIENTO" date,
    "PER_CELULAR" text,
    "PER_SALARIO" numeric(7,2),
    "PER_GENERO" text
);
    DROP TABLE public."PERSONA";
       public         postgres    false                       0    16402 	   DIRECCION 
   TABLE DATA               �   COPY public."DIRECCION" ("DIR_CODIGO", "DIR_CALLE_PRINCIPAL", "DIR_CALLE_SECUNDARIA", "DIR_NUMERO", "DIR_CEDULA_PER") FROM stdin;
    public       postgres    false    197   �       �
          0    16394    PERSONA 
   TABLE DATA               �   COPY public."PERSONA" ("PER_CEDULA", "PER_NOMBRE", "PER_APELLIDO", "PER_EDAD", "PER_FECHA_NACIMIENTO", "PER_CELULAR", "PER_SALARIO", "PER_GENERO") FROM stdin;
    public       postgres    false    196          �
           2606    16409    DIRECCION DIRECCION_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public."DIRECCION"
    ADD CONSTRAINT "DIRECCION_pkey" PRIMARY KEY ("DIR_CODIGO");
 F   ALTER TABLE ONLY public."DIRECCION" DROP CONSTRAINT "DIRECCION_pkey";
       public         postgres    false    197            �
           2606    16401    PERSONA PERSONA_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public."PERSONA"
    ADD CONSTRAINT "PERSONA_pkey" PRIMARY KEY ("PER_CEDULA");
 B   ALTER TABLE ONLY public."PERSONA" DROP CONSTRAINT "PERSONA_pkey";
       public         postgres    false    196            �
           2606    16417    DIRECCION FK_DIR_CEDULA_PER    FK CONSTRAINT     �   ALTER TABLE ONLY public."DIRECCION"
    ADD CONSTRAINT "FK_DIR_CEDULA_PER" FOREIGN KEY ("DIR_CEDULA_PER") REFERENCES public."PERSONA"("PER_CEDULA");
 I   ALTER TABLE ONLY public."DIRECCION" DROP CONSTRAINT "FK_DIR_CEDULA_PER";
       public       postgres    false    197    2690    196                r   x�M�=�0@��>EN��$�����t�bU.�D5�篲����#n.+o�u��&�c/@�O>�>�0���{*̼-�if� z��Ӏ���,�/>j�duӧ�Š��>D�\� �      �
   �  x����r9�k�~�PݭϾLL�C�l�R[Ss��"�l�j;�������H-�?�v��� d���$9˳"㘐����U��wU]+�����Y�ŵ6z���(/Yy��3����Bp�	*eoq��e���U��d8˙�9�n�a�;U?ȵF��,�Y��r�e�iAK�x:R�����T�^���?���u�,��Je ����-�.��RPT�ihnC'}��f�R}����!R�!jf���!�ۏ]��fmT!��l5��������ns����s���|�-e��"˅��`���Tv��xt�~�����[�6���[�ܒ�E��h��[����8�2��7�p�R��?�k�LA&Ί�,@*�LB�	�q�.���ӹ�d�����Z�	*jY"s(�Е|�?>̮\ܨV6[���%gyv��a^�!�MQr��;�T�^\)�� 5�>�\\+��^"�A*�!gP��TB!�����凱I�'�R�m蝮e��dڑ�'���R��D���#Ȃ�(a���BٯU�*#m�Bhn�s\�XLB]�2[O�M7F������A�CZvX����j��-d�F%z/a�k=�yH�(&5_t5?�܄@�S䆷�l��+���l�D��I��reb��PL[|�V[m�s)��F���_0O�_t%?��T<Gnq��~������L��(��8Ρ�E�ۣ;hL�ՠ�[�%T{>�����QT�[�˺��{�}�ף��vдֱ���G�i�"�_�Ȗ�hW�~�9�V�ml�Z�(�(Gnض��ڕF~�һ�<G�+"�q[��Y��q[�q�Յ�l��P,��<��%��kf�T��S�y<�mi�?Z�~��Ph�^������tx�|���H�c�� �p�(���g�ϱA�l`؀�_) ���76��uq#�6��qbܸ4�jm�������y?��M��e�c�h** ����9A8�
BY���Xɇ:6b ~I�M�۱��^%F�J�V�'�7e��(?������O�K�E����N��� 񧻸���FI�%���X��>z�I���Dvş��>p\�TO�=E���n$���Ͽ�Fy
I%$��C7mUj;���x)��.�ϽK������6���ȔO�E�ɓщ���?�%H
���h�?��*-��\�o�Jy�U�y��,u�R�M*R&Ѥ	t��o�y�S�Ȓ��	����?)������h'ͨDR*�J_�f[m�v/��R.�蒷#�t!�_�����(z O�D"L�T:���%�ʔJ$��9=I��/y�'=be�y��aݯ5TU�_��HR�"E��c%���VB/n^�'1���` 1���)�H�!
�Юυ��P"gB"��HD��]��x#��HD��e��`����] �9�'8�#G��HҟF�jF8��H��#J�2�"�{l�'Dʓ"�(�u�z�х��,}��wRlxC���J"���х�Hc�0�L��&w��ar�\�	�H�%]��mx�qz�HB&6#�;2�][\
�2Q�8�f �aU�ȟ��o$n�?���G������Hx�8
��{Hp��x@��nr����9b�9bS��?�at�W��N����	F�8FD�`���5,z��=����TL,�Ѣ$F\l1r���j�[(���1�1�S��up����#�#V���t���sU�Y�?jei-����z��]�9���c	���"�)S٩�����8k�����9���f������ؼEP��=��BoC�'i����zbQ9o��`/F�ma�x��v�J�G%����,�e��!�VO��
�啸�o`l��D���D�D�Y8�a�~�nB�(��=�bG�6H��?���r$L�msqT�D��A��<��lt�v;~��`GC�Z�,�^�k��p���c�0;�e">���XO{-E��gUo�]��S5�ޏ�u���m�9��Y�죿�N�ߑ|Q�
J�b�E�G�I���r�wO�:��)(LS�_�:ſ@e��Q}�T��$,s��{���G;��*%KPS]�s���G��K9$�U��w�S]�Υ��Q
ԝ�ց�[y�a��W�t�h���K���D���蓄�e0r7����+(*�ڵM�x�DwБ�_��X��|�p\@�ܷq��WA����W����j܊���}L��gm\�18ѕ���������P�SY�2�6���%�ص�w�ݞb��o߼y�[=ʇ     