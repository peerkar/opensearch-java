/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.SnowballTokenFilter
@JsonpDeserializable
public final class SnowballTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final SnowballLanguage language;

	// ---------------------------------------------------------------------------------------------

	public SnowballTokenFilter(Builder builder) {
		super(builder);

		this.language = Objects.requireNonNull(builder.language, "language");

	}

	public SnowballTokenFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "snowball";
	}

	/**
	 * API name: {@code language}
	 */
	public SnowballLanguage language() {
		return this.language;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "snowball");
		super.serializeInternal(generator, mapper);

		generator.writeKey("language");
		this.language.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnowballTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SnowballTokenFilter> {
		private SnowballLanguage language;

		/**
		 * API name: {@code language}
		 */
		public Builder language(SnowballLanguage value) {
			this.language = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnowballTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnowballTokenFilter build() {

			return new SnowballTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnowballTokenFilter}
	 */
	public static final JsonpDeserializer<SnowballTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnowballTokenFilter::setupSnowballTokenFilterDeserializer, Builder::build);

	protected static void setupSnowballTokenFilterDeserializer(DelegatingDeserializer<SnowballTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::language, SnowballLanguage._DESERIALIZER, "language");

		op.ignore("type");
	}

}
